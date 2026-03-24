package oop_00000106169_InocentiusNoelPrasetya.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("[Hub] Device ${device.name} ditambahkan ke sistem")
    }

    fun turnOffAllSwitches() {
        println("\n[Hub] Mematikan semua perangkat yang bisa dimatikan...")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        println("\n[Hub] Mengaktifkan Mode Keamanan...")
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord()
            }

            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}
