package com.gmail.giphytestingapp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gmail.giphytestingapp.R
import com.gmail.giphytestingapp.databinding.ItemGiftBinding
import com.gmail.giphytestingapp.model.entity.DataItem

class GifsAdapter : PagingDataAdapter<DataItem, GifsAdapter.Holder>(GifsDiffCallback()) {

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val gif = getItem(position) ?: return
        with(holder.binding) {
            if (gif.title.isNotBlank()) titleTextView.text = gif.title
            if (gif.sourcePostUrl.isNotBlank()) sourceTextView.text = gif.sourcePostUrl
            loadGif(gifImageView, gif.images.previewGif.url)
            root.setOnClickListener {
                navigateToGif(gif, it)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemGiftBinding.inflate(inflater, parent, false)
        return Holder(binding)
    }

    private fun loadGif(imageView: ImageView, url: String) {
        val context = imageView.context
        if (url.isNotBlank()) {
            Glide.with(context)
                .load(url)
                .circleCrop()
                .placeholder(R.drawable.ic_baseline_gif_24)
                .error(R.drawable.ic_baseline_gif_24)
                .into(imageView)
        } else {
            Glide.with(context)
                .load(R.drawable.ic_baseline_gif_24)
                .into(imageView)
        }
    }

    private fun navigateToGif(
        gif: DataItem,
        view: View
    ) {
        val direction =
            ListFragmentDirections.actionListFragmentToDetailsFragment(gif.id)
        view.findNavController().navigate(direction)
    }

    class Holder(
        val binding: ItemGiftBinding
    ) : RecyclerView.ViewHolder(binding.root) {
    }
}

class GifsDiffCallback : DiffUtil.ItemCallback<DataItem>() {
    override fun areItemsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
        return oldItem == newItem
    }
}