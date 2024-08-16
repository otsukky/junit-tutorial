package item

import org.example.item.Item
import org.example.item.ItemStock
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ItemStockTest {
    @DisplayName("該当する商品名が")
    @Nested
    inner class ContainsName {
        @Test
        fun `ある場合、Falseを返すこと`() {
            val itemStock = ItemStock(
                listOf(
                    Item(
                        id = "1",
                        name = "商品名A",
                        size = 60,
                    ),
                    Item(
                        id = "2",
                        name = "商品名B",
                        size = 90,
                    ),
                )
            )
            assertTrue(itemStock.containsName("商品名A"))
        }

        @Test
        fun `ない場合、Falseを返すこと`() {
            val itemStock = ItemStock(
                listOf(
                    Item(
                        id = "1",
                        name = "商品名A",
                        size = 60,
                    ),
                    Item(
                        id = "2",
                        name = "商品名B",
                        size = 90,
                    ),
                )
            )
            assertFalse(itemStock.containsName("商品名C"))
        }
    }
}