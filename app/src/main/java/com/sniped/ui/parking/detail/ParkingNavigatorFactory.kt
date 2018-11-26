package com.sniped.ui.parking.detail

import android.app.Activity
import com.sniped.ui.navigator.Navigator
import com.sniped.ui.parking.domain.Parking
import javax.inject.Inject

class ParkingNavigatorFactory @Inject constructor(private val activity: Activity) {

    fun create(item: Parking): Navigator = ParkingNavigator(activity, item)
}
