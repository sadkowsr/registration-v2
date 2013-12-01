#!/bin/bash

str="This pull request is made from multiple squashed commits. If you don't believe - check my fork :-). Cheers!"

touch git-is-awesome.txt
git add .

for (( i=0; i<${#str}; i++ )); do
	letter=${str:$i:1}
	echo $letter >> git-is-awesome.txt
	git commit -am "Added $letter."
done

git checkout master

git merge git-is-awesome
git rebase origin/master -i

commitmsg=$'Git is awesome :-)\n\n'$str

git commit --amend -m "$commitmsg" 
