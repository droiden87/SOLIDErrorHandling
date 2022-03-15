package com.solid.errorhandling.error.contracts

import android.os.Parcelable
import com.solid.errorhandling.databinding.FragmentErrorBinding

interface ErrorView : Parcelable {
    fun setupView(binding: FragmentErrorBinding)
}
