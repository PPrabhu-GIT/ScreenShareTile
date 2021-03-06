package com.npes87184.screenshottile

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.service.quicksettings.TileService

class ScreenShareTileService : TileService() {
    override fun onClick() {
        super.onClick()
        val intent = Intent(this, ScreenShareActivity::class.java)
        intent.flags = FLAG_ACTIVITY_NEW_TASK
        startActivityAndCollapse(intent)
    }
}