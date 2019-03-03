package com.gahlot.branchtask

import android.app.Application
import io.branch.referral.Branch
import io.branch.referral.BuildConfig

class BranchTaskApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        val branch = Branch.getAutoInstance(this)

        if (BuildConfig.DEBUG) {
            branch.setDebug()
        }
    }
}