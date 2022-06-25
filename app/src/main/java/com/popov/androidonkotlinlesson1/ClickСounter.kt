package com.popov.androidonkotlinlesson1

class ClickСounter {
    var count: Int? = null
        get() {
            return if (field == null) {
                0
            } else {
                field
            }
        }
}