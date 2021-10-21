package com.example.data.remote

import com.example.data.remote.dto.Notification

interface OneSignalService {

    suspend fun sendNotification(notification: Notification): Boolean

    companion object {
        const val ONE_SIGNAL_APP_ID = "548ce7e9-4a92-40f1-92ba-4df7348f6019"
        const val NOTIFICATIONS = "https://onesignal.com/api/v1/notifications"
    }

}