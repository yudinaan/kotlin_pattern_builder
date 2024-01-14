fun main() {
    val client = Client().also {
        it.order("Gold")
    }
    client.order("Silver")
    client.order("Steel")
}