class Gold_jeweler(): Builder() {
    private var shape: String? = null
    private var metal: String? = null
    private var decoration: String? = null
    override fun prepare_the_metal(): String? {
        println("Подготовлен металл - золото")
        metal = "Gold"
        return metal
    }

    override fun give_shape(): String? {
        println("Придана форма - кольцо")
        shape = "Ring"
        return shape
    }

    override fun add_decoration(): String? {
        println("Прикреплено украшение - изумруд")
        decoration = "Emerald"
        return decoration
    }

    override fun build(): Ring {
        val ring = Ring(prepare_the_metal(), give_shape(), add_decoration())
        if (ring.metal != null && ring.shape != null && ring.decoration != null) {
            println("Кольцо готово!")
        }
        else {
            throw IllegalAccessException("There are problems, the ring is not created!")
        }
        return ring
    }
}