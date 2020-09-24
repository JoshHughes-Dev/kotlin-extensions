package com.jhughes.kotlinextensions

import androidx.fragment.app.FragmentManager

fun FragmentManager.isFragmentDisplayed(tag: String): Boolean {
    return findFragmentByTag(tag)?.isVisible == true
}