1. 安装（需要 Ruby）：ruby -e "$(curl -fsSL https://raw.github.com/Homebrew/homebrew/go/install)"
2. 搜索：brew search mysql
3. 查询：brew info mysql 主要看具体的信息，比如目前的版本，依赖，安装后注意事项等
4. 更新：brew update 这会更新 Homebrew 自己，并且使得接下来的两个操作有意义——
5. 检查过时（是否有新版本）：brew outdated 这回列出所有安装的软件里可以升级的那些
6. 升级：brew upgrade 升级所有可以升级的软件们
7. 清理：brew cleanup 清理不需要的版本极其安装包缓存