- git config --global user.name "Your Name"
- git config --global user.email "email@example.com"
- git reflog : 查看命令历史，以便确定要回到未来的哪个版本

### start a working area
- git init : 初始化一个Git仓库（Create an empty Git repository or reinitialize an existing one）
- git clone : Clone a repository into a new directory

### work on the current change
- git add <files> : Add file contents to the index
- git reset : 跳转版本（Reset current HEAD to the specified state）
> 用HEAD表示当前版本，上一个版本就是HEAD^，上上一个版本就是HEAD^^，当然往上100个版本写100个^比较容易数不过来，所以写成HEAD~100
用命令git reset HEAD file可以把暂存区的修改撤销掉（unstage），重新放回工作区
- git rm <file> : Remove files from the working tree and from the index（用于删除一个文件）

### grow, mark and tweak your common history
- git commit : Record changes to the repository
- git diff <file> : 查看difference，显示的格式正是Unix通用的diff格式（Show changes between commits, commit and working tree, etc）
- git checkout : Switch branches or restore working tree files
> 命令git checkout -- readme.txt意思就是，把readme.txt文件在工作区的修改全部撤销，这里有两种情况：
一种是readme.txt自修改后还没有被放到暂存区，现在，撤销修改就回到和版本库一模一样的状态；
一种是readme.txt已经添加到暂存区后，又作了修改，现在，撤销修改就回到添加到暂存区后的状态。
总之，就是让这个文件回到最近一次git commit或git add时的状态。
- git branch : List, create, or delete branches

### examine the history and state
- git status : 可以让我们时刻掌握仓库当前的状态（Show the working tree status）
- git log : 显示从最近到最远的提交日志（Show commit logs）
> git log --pretty=oneline : 一行输出

---
### git 结构
工作区 add 暂存区 commit 本地版本库 push 远程库

### 创建版本库
> \$ git init
> \$ git add readme.txt
> \$ git commit -m "wrote a readme file"

### 查看状态
> \$ git status
> \$ git diff readme.txt

### 回退
> \$ git log
> \$ git log --pretty=oneline #查看git版本记录
> \$ git reset --hard HEAD^
> \$ git reflog #查看git操作日志

### 撤销修改
> \$ git checkout -- readme.txt
>> 命令git checkout -- readme.txt意思就是，把readme.txt文件在工作区的修改全部撤销，这里有两种情况：
>> 1. readme.txt自修改后还没有被放到暂存区，现在，撤销修改就回到和版本库一模一样的状态；
>> 2. readme.txt已经添加到暂存区后，又作了修改，现在，撤销修改就回到添加到暂存区后的状态。
>> 总之，就是让这个文件回到最近一次git commit或git add时的状态。
>> ***checkout是将暂存库还原到工作区***

> \$ git reset HEAD readme.txt
>> git reset命令既可以回退版本，也可以把暂存区的修改回退到工作区。当我们用HEAD时，表示最新的版本。
>> ***reset是将版本库还原到暂存区***

场景1：当你改乱了工作区某个文件的内容，想直接丢弃工作区的修改时，用命令git checkout -- file。

场景2：当你不但改乱了工作区某个文件的内容，还添加到了暂存区时，想丢弃修改，分两步，第一步用命令git reset HEAD file，就回到了场景1，第二步按场景1操作。

场景3：已经提交了不合适的修改到版本库时，想要撤销本次提交，参考版本回退一节，不过前提是没有推送到远程库。

git checkout其实是用版本库里的版本替换工作区的版本，无论工作区是修改还是删除，都可以“一键还原”。

### 删除
> \$ git rm test.txt

命令git rm用于删除一个文件。如果一个文件已经被提交到版本库，那么你永远不用担心误删，但是要小心，你只能恢复文件到最新版本，你会丢失最近一次提交后你修改的内容。

### 修改
每次修改，如果不add到暂存区，那就不会加入到commit中。

### 创建远程库
> \$ ssh-keygen -t rsa -C "youremail@example.com"
>> 如果一切顺利的话，可以在用户主目录里找到.ssh目录，里面有id_rsa和id_rsa.pub两个文件，这两个就是SSH Key的秘钥对，id_rsa是私钥，不能泄露出去，id_rsa.pub是公钥，可以放心地告诉任何人

> \$ git remote add origin git@github.com:michaelliao/learngit.git
>> 把上面的michaelliao替换成你自己的GitHub账户名，否则，你在本地关联的就是我的远程库，关联没有问题，但是你以后推送是推不上去的，因为你的SSH Key公钥不在我的账户列表中。
添加后，远程库的名字就是origin，这是Git默认的叫法，也可以改成别的，但是origin这个名字一看就知道是远程库。

> \$ git push -u origin master
>> 把本地库的内容推送到远程，用git push命令，实际上是把当前分支master推送到远程。
由于远程库是空的，我们第一次推送master分支时，加上了-u参数，Git不但会把本地的master分支内容推送的远程新的master分支，还会把本地的master分支和远程的master分支关联起来，在以后的推送或者拉取时就可以简化命令。

> \$ git push origin master

---
# 场景

### 克隆远程库
> \$ git clone git@github.com:michaelliao/gitskills.git

### 当add错误的时候
> \$ git rm -r --cached
>> 该方法为递归删除
>> “add”有个“-n”，可以预览会加进哪些文件

### 分支
> \$ git checkout -b dev
>> git checkout命令加上-b参数表示创建并切换，相当于以下两条命令：
git branch dev
git checkout dev

> \$ git branch
>> git branch命令会列出所有分支，当前分支前面会标一个*号

> \$ git add readme.txt
> \$ git commit -m "branch test"

> \$ git checkout master
>> 切换回master分支

> \$ git merge dev
>> git merge命令用于合并指定分支到当前分支

> \$ git branch -d dev
>> 删除dev分支

### 解决冲突
> \$ git checkout -b feature1
> \$ git add readme.txt 
> \$ git commit -m "AND simple"
> \$ git checkout master
> \$ git add readme.txt
> \$ git commit -m "& simple"
> \$ git merge feature1
>> Git用<<<<<<<，=======，>>>>>>>标记出不同分支的内容，我们修改如下后保存

> \$ git log --graph --pretty=oneline --abbrev-commit
>> 用带参数的git log也可以看到分支的合并情况

### 删除git远程分支
> \$ git push origin :test
>> git push [远程名] :[分支名]
>> git push [远程名] [本地分支]:[远程分支] 语法，如
果省略 [本地分支]，那就等于是在说“在这里提取空白然后把它变成[远程分支]”。

### 删除代码库中文件
> \$ git rm --cached "文件路径"
>> 不删除物理文件，仅将该文件从缓存中删除
> \$ git rm --f "文件路径"
>> 将该文件从缓存中删除，还会将物理文件删除

### 更新代码
> \$ git pull origin master
或者
> \$ git fetch origin master
> \$ git merge origin/master
>> 1. 从远程的origin仓库的master主分支更新最新的版本到origin/master分支上
>> 2. 合并内容到本地master分支

### 更新代码，保留生产服务器上所做的改动
> \$ git stash
> \$ git pull
> \$ git stash pop

### 将缓存区内容释放恢复
> \$ git stash apply
>> 将当前分支的最后一次缓存的内容释放出来，但是刚才的记录还存在list中

> \$ git stash pop
>> 将当前分支的最后一次缓存的内容释放出来，但是刚才的记录不存在list中

### 撤销“本地的”修改（修改了文件，没有add）
场景: 一只猫从键盘上走过，无意中保存了修改，然后破坏了编辑器。不过，你还没有 commit 这些修改。你想要恢复被修改文件里的所有内容 — 就像上次 commit 的时候一模一样。
方法: git checkout -- &lt;bad filename&gt;
原理: git checkout 会把工作目录里的文件修改到 Git 之前记录的某个状态。你可以提供一个你想返回的分支名或特定 SHA ，或者在缺省情况下，Git 会认为你希望 checkout 的是 HEAD，当前 checkout 分支的最后一次 commit。
记住：你用这种方法“撤销”的任何修改真的会完全消失。因为它们从来没有被提交过，所以之后 Git 也无法帮助我们恢复它们。你要确保自己了解你在这个操作里扔掉的东西是什么！（也许可以先利用 git diff 确认一下）

### 重置“本地的”修改（修改了文件，已经add）
场景: 你在本地提交了一些东西（还没有 push），但是所有这些东西都很糟糕，你希望撤销前面的三次提交 — 就像它们从来没有发生过一样。
方法: git reset &lt;last good SHA&gt; 或 git reset --hard &lt;last good SHA&gt;
原理: git reset 会把你的代码库历史返回到指定的 SHA 状态。 这样就像是这些提交从来没有发生过。缺省情况下， git reset 会保留工作目录。这样，提交是没有了，但是修改内容还在磁盘上。这是一种安全的选择，但通常我们会希望一步就“撤销”提交以及修改内容 — 这就是 --hard 选项的功能。

### 删除本地untracked文件
```
git clean -xdf
```

### 在撤销“本地修改”之后再恢复
场景: 你提交了几个 commit，然后用 git reset --hard 撤销了这些修改（见上一段），接着你又意识到：你希望还原这些修改！
方法: git reflog 和 git reset 或 git checkout
原理: git reflog 对于恢复项目历史是一个超棒的资源。你可以恢复几乎 任何东西 — 任何你 commit 过的东西 — 只要通过 reflog。

### 撤销一个“已push”的改变
场景: 你已经执行了 git push, 把你的修改发送到了 GitHub，现在你意识到这些 commit 的其中一个是有问题的，你需要撤销那一个 commit.
方法: git revert &lt;SHA&gt;
原理: git revert 会产生一个新的 commit，它和指定 SHA 对应的 commit 是相反的（或者说是反转的）。如果原先的 commit 是“物质”，新的 commit 就是“反物质” — 任何从原先的 commit 里删除的内容会在新的 commit 里被加回去，任何在原先的 commit 里加入的内容会在新的 commit  里被删除。

### 向 GitHub 上贡献代码
1. 先fork下别人的代码，于是你的github上就出现了同名的项目
2. 把这个自己的项目git clone到本地，修修改改，然后push到你自己的项目里
3. 在github上你的项目页面有个按钮，叫Pull request，对 你点它就会把你的修改发到对方的项目里

在你fork他的项目之后，如果他又更新了代码，你自己fork的项目怎么做到和原项目同步呢？ 
1. 先git clone我的代码到本地，然后修修改改
2. 然后你不是不能push到我的项目里么，你可以先在github页面上fork我的项目
3. 有了你自己的项目地址（url）之后呢，你在本地操作git remote add [sort name] [your url]，意思就是添加第二个远程仓库地址，这个仓库的“昵称”就是你刚指定的[sort name]
4. 之后push文件呢 就通过指定这个［sort name］来push到这个你自己的仓库里