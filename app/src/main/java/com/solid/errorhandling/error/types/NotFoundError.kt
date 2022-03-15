package com.solid.errorhandling.error.types

import com.solid.errorhandling.R
import com.solid.errorhandling.databinding.FragmentErrorBinding
import com.solid.errorhandling.error.contracts.ErrorView
import kotlinx.parcelize.Parcelize

@Parcelize
class NotFoundError : ErrorView {

    override fun setupView(binding: FragmentErrorBinding) {
        binding.apply {
            errorTitle.setText(R.string.key_error)
            errorDescription.setText(R.string.key_not_found_error)
            errorImage.setImageResource(R.drawable.ic_not_found)
        }
    }

}