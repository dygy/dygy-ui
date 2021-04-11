import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.css
import styled.styledButton

external interface DygyButtonProps : RProps {
    var name: String
    var onClick: () ->Any
}

data class DygyButtonState(val name: String) : RState

@JsExport
class DygyButton(props: DygyButtonProps) : RComponent<DygyButtonProps, DygyButtonState>(props) {

    init {
        state = DygyButtonState(props.name)
    }

    override fun RBuilder.render() {
        styledButton {
            css {
                +Styles.textContainer
            }
            attrs {
                onClickFunction = {
                    props.onClick()
                }
            }
            +props.name
        }
    }
}
