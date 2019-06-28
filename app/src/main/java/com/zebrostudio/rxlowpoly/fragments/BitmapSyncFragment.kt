package com.zebrostudio.rxlowpoly.fragments

import android.view.View
import com.zebrostudio.rxlowpoly.R
import kotlinx.android.synthetic.main.fragment_bitmap_async.view.*

class BitmapSyncFragment : BaseFragment() {
  override fun configureView(view: View) {
    view.toolbarFragment.title = "Bitmap Sync Example"
    view.imageView.setImageDrawable(resources.getDrawable(R.drawable.captain))
  }
}