package com.solid.errorhandling.error.types

import com.solid.errorhandling.R
import com.solid.errorhandling.databinding.FragmentErrorBinding
import com.solid.errorhandling.error.contracts.ErrorView
import kotlinx.parcelize.Parcelize

@Parcelize
class ServerError : ErrorView {

    override fun setupView(binding: FragmentErrorBinding) {
        binding.apply {
            errorTitle.setText(R.string.key_error)
            errorDescription.setText(R.string.key_server_error)
            errorImage.setImageResource(R.drawable.ic_server)
        }
    }

}