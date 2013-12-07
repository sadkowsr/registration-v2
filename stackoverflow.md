# From [StackOverflow](http://stackoverflow.com/tags/git/info):

[Git](http://git-scm.com/) is an open-source [distributed version control system][1] (DVCS) with an emphasis on speed. [tag:Git] was initially designed and developed by Linus Torvalds for [tag:Linux] kernel development. Every Git working directory contains a full-fledged repository with complete history and full revision tracking capabilities, not dependent on network access or a central server.

There are many resources and tutorials available free online for Git beginners; see the bottom of this page for links to some of these resources.

>Characteristics
>==============

 - Strong support for non-linear development
 - Distributed development
 - Compatibility with existing systems/protocols
 - Efficient handling of large projects
 - Cryptographic authentication of history
 - Toolkit-based design
 - Pluggable merge strategies
 - Garbage accumulates unless collected
 - Periodic explicit object packing

>Data structures
>==============

![enter image description here][2]

>External Links
>==============

- [The Git Community Book](http://book.git-scm.com/)
- [Official Git Wiki](https://git.wiki.kernel.org/)
- [Git online documentation](http://git-scm.com/documentation)
- [Git source code](http://git.kernel.org/?p=git/git.git;a=summary)
- [Git Wikipedia Article](http://en.wikipedia.org/wiki/Git_(software))

>Internal Links
>==============

Installation/Setup
------------------

  - [How to install Git][ans_installgit]
  - How do you set up Git?  Try to cover Linux, Windows, Mac, think 'client/server' mindset.
    - [Setup GIT Server with Msysgit on Windows][3]
  - [How do you create a new project/repository?][ans_newrepo]
  - [How do you configure it to ignore files (.obj, .user, etc) that are not really part of the codebase?][ans_ignorefiles]

Working with the code
---------------------

  - [How do you get the latest code?][4]
  - [How do you check out code?][ans_checkcode]
  - [How do you commit changes?][ans_commitchanges]
  - [How do you see what's uncommitted, or the status of your current codebase?][ans_uncommit]
  - [How do you destroy unwanted commits?][ans_reset]
  - [How do you compare two revisions of a file, or your current file and a previous revision?][ans_diff_file]
  - [How do you see the history of revisions to a file?][5]
  - [How do you undo (revert or reset) a commit?][6]

Tagging, branching, releases, baselines
----------------------------

  - [How do you 'mark' 'tag' or 'release' a particular set of revisions for a particular set of files so you can always pull that one later?][ans_tagging]
  - [How do you branch?][7]
  - [How do you merge branches?][8]
  - [What is rebasing?][9]
  - [How do I track remote branches?][10]
  - [How can I create a branch on a remote repository?][11]
  - [How do I delete a branch on a remote repository?][12]
  - [Git workflow examples][13]

Other
-----

 - [msysgit][ans_guis] - Cross platform, included with Git
 - [gitk][ans_guis] - Cross platform history viewer, included with Git
 - [gitnub][ans_guis] - Mac OS X
 - [gitx][ans_guis] - Mac OS X history viewer
 - [smartgit][ans_guis] - Cross platform, commercial, beta
 - [tig][14] - console GUI for Linux
 - [qgit][15] - GUI for Windows, Linux
 - [Git Extensions][ans_guis] - package for Windows, includes friendly GUI

###Any other common tasks a beginner should know?
 - [Git Status tells you what you just did, what branch you have, and other useful information][16]

Other Git beginner's references
--------------------

  - [Git guide][17]
  - [Pro Git - book by Scott Chacon][18]
  - [Git magic][19]
  - [gitcasts][20]
  - [GitHub guides][21]
  - [Git - SVN Crash Course][22]
  - [Git from the bottom up][23]
  - [Git ready][24]
  - [gitref.org][25]
  - [Git visual cheatsheet][26]
  - [Githug][27]
  - [tryGit][28]
  - [A Visual Git Reference][29]

Delving into Git
--------------------

  - [Understanding Git conceptually][30]

Comparison of revision control software
--------------------
  - [Comparison of revision control software][31]
  [ans_newrepo]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide#320140
  [ans_ignorefiles]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide#316062
  [ans_commitchanges]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide#316055
  [ans_uncommit]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide#319465
  [ans_tagging]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide#322967
  [ans_guis]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide#323559
  [ans_installgit]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide#323764
  [ans_checkcode]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide#323906
  [ans_reset]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide#323898
  [ans_diff_file]:http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide/1762631#1762631


  [1]: http://stackoverflow.com/tags/dvcs/info
  [2]: http://i.stack.imgur.com/GEGy5.png
  [3]: http://stackoverflow.com/questions/1482824/setup-git-server-with-msysgit-on-windows
  [4]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide/1350157#1350157
  [5]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide/2114836#2114836
  [6]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide/323898#323898
  [7]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide/816614#816614
  [8]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide/816636#816636
  [9]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide/5985070#5985070
  [10]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide/1590791#1590791
  [11]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide/1590803#1590803
  [12]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide/5977604#5977604
  [13]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide/5968622#5968622
  [14]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide/322989#322989
  [15]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide/644129#644129
  [16]: http://stackoverflow.com/questions/315911/git-for-beginners-the-definitive-practical-guide/319465#319465
  [17]: http://wiki.sourcemage.org/Git_Guide
  [18]: http://book.git-scm.com/
  [19]: http://www-cs-students.stanford.edu/~blynn/gitmagic/
  [20]: http://www.gitcasts.com/
  [21]: http://help.github.com/
  [22]: http://git.or.cz/course/svn.html "Git - SVN Crash Course"
  [23]: http://www.newartisans.com/2008/04/git-from-the-bottom-up/
  [24]: http://www.gitready.com/
  [25]: http://gitref.org/
  [26]: http://www.ndpsoftware.com/git-cheatsheet.html
  [27]: https://github.com/Gazler/githug
  [28]: http://try.github.com/
  [29]: http://marklodato.github.com/visual-git-guide/index-en.html
  [30]: http://www.eecs.harvard.edu/~cduan/technical/git/
  [31]: http://en.wikipedia.org/wiki/Comparison_of_revision_control_software