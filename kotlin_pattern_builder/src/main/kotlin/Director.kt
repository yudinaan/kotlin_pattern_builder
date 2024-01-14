class Director (metal: String){
    init{ when(metal){
        "Gold" -> Gold_jeweler().build()
        "Silver" -> Silver_jeweler().build()
        else -> throw IllegalAccessException("There is no master for the selected metal!")
    }
    }
}