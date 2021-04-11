import kotlinx.css.*
import kotlinx.css.properties.BoxShadow
import kotlinx.css.properties.BoxShadows
import kotlinx.css.properties.transition
import kotlinx.css.properties.ms
import styled.StyleSheet

object Styles : StyleSheet("DygyButtonStyles", isStatic = true) {
    val textContainer by css {
        padding(8.px)
        margin(6.px)
        borderRadius = 8.px
        backgroundColor = Color.chocolate
        color = Color.white
        borderColor = Color.white
        transition("all", 500.ms)
        cursor = Cursor.pointer

        hover {
            backgroundColor = Color.brown
            borderColor = Color.brown
            boxShadow += BoxShadow(false, 2.px, 1.px, 1.px, 2.px, Color.brown)
        }

        active {
            backgroundColor = Color.burlyWood
            borderColor = Color.burlyWood
            color = Color.black
            boxShadow += BoxShadow(false, 1.px, 1.px, 1.px, 1.px, Color.chocolate)
        }

    }
}
