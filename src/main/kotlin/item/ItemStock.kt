package org.example.item

data class ItemStock(
    val stocks: List<Item>,
) {
    fun containsName(itemName: String): Boolean =
        stocks.map { it.name }.contains(itemName)

    fun size(id: String): Int {
        val filteredBySize = stocks.filter { it.id == id }
        return when {
            filteredBySize.isEmpty() -> 0
            filteredBySize.size > 1 -> throw IllegalArgumentException("List内に同じIDの要素が複数存在します")
            else -> filteredBySize.first().size
        }
    }
}
