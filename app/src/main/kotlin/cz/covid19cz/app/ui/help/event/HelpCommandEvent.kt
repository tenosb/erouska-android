package cz.covid19cz.app.ui.help.event

import arch.event.LiveEvent

class HelpCommandEvent(val command: Command) : LiveEvent() {

    enum class Command{
        GO_BACK,
    }

}