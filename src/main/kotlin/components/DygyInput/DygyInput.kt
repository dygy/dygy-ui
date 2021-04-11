package components.DygyInput

import kotlinx.html.js.onChangeFunction
import org.w3c.dom.HTMLInputElement
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.css
import styled.styledInput

external interface DygyInputProps : RProps {
    var onInput: (value: String)-> Any
    var placeholder: String
}

data class DygyInputState(val text: String) : RState

@JsExport
class DygyInput(props: DygyInputProps) : RComponent<DygyInputProps, DygyInputState>(props) {

    init {
        state = DygyInputState(props.placeholder)
    }

    override fun RBuilder.render() {
        styledInput {
            css {
                +Styles.textContainer
            }
            attrs {
                onChangeFunction = {
                    val target = it.target as HTMLInputElement
                    props.onInput(target.value)
                }
                placeholder = props.placeholder
            }
        }
    }
}
