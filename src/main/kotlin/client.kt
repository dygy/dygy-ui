import components.DygyInput.DygyInput
import react.dom.render
import kotlinx.browser.document
import kotlinx.browser.window

fun main() {
    window.onload = {
        render(document.getElementById("root")) {
            child(DygyButton::class) {
                attrs {
                    name = "Subscribe"
                    onClick = fun() {
                        println(123)}
                }
            }
            child(DygyInput::class) {
                attrs {
                    placeholder = "Subscribe"
                    onInput = fun(value: String) {
                        println(value)
                    }
                }
            }

        }
    }
}
