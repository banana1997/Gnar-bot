package xyz.gnarbot.gnar.commands.executors.admin

import net.dv8tion.jda.core.entities.Message
import xyz.gnarbot.gnar.BotConfiguration
import xyz.gnarbot.gnar.commands.Category
import xyz.gnarbot.gnar.commands.Command
import xyz.gnarbot.gnar.commands.CommandExecutor

@Command(
        aliases = arrayOf("restartShards"),
        description = "Restart all Shard instances.",
        administrator = true,
        category = Category.NONE
)
class RestartShardsCommand : CommandExecutor() {
    override fun execute(message: Message, args: Array<String>) {
        message.send().embed("Restarting Shards") {
            color = BotConfiguration.ACCENT_COLOR
            description = "Bot is now restarting."
        }.rest().queue()

        bot.restart()
    }
}