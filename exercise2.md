# Git

## Commands

- git config
  
git-config - Get and set repository or global options

```
git config --global user.name "Harald Mandl"
git config --global user.email harald.mandl@example.com
```

- git init  

The git init command creates a new Git repository. It can be used to convert an existing, unversioned project to a Git repository or initialize a new, empty repository.

```
git init
git add somefile
git commit -m "initial commit"
git remote add origin https://github.com/username/new_repo
git push -u origin master
```

- git commit

The git commit command captures a snapshot of the project's currently staged changes. Committed snapshots can be thought of as “safe” versions of a project

```
git commit 
optional arguments:
-a: commit all changes(not recomended if you're on windows and are not using vim, 
windows make .swp files, must be very careful)
-m: to add a message, e.g.: git commit -m "message here"
```

- git status

The git status command is used to display the state of the repository and staging area. It allows us to see the tracked, untracked files and changes. 

```
git status # To see all changed files
git add -A # add all changed files
git commit -m 'Message'
git push origin <branch-name>
```

- git add

The git add command adds a change in the working directory to the staging area. It tells Git that you want to include updates to a particular file in the next commit.

`
git add <file> or you can do git add -A to add all files
`

- git log

The git log command shows a list of all the commits made to a repository. You can see the hash of each Git commit, the message associated with each commit, and more metadata. This command is useful for displaying the history of a repository.

```
git log  # show commits
git log -p  # show diff files
git log -p <path>  # show diff specified files
```

- git diff

Diff command is used in git to track the difference between the changes made on a file.

```
git diff branch1 origin/branch2	#show diff referenced from second branch
git diff branch1 branch2 file.txt #show diff only between file.txt
```


- git pull

The git pull command is actually a combination of two other commands, git fetch followed by git merge . In the first stage of operation git pull will execute a git fetch scoped to the local branch that HEAD is pointed at. Once the content is downloaded, git pull will enter a merge workflow.

```
git pull <remote> <branch>
# is equal to
git fetch <remote> <branch>
git merge FETCH_HEAD
```

- git push

The git push command is used to upload local repository content to a remote repository. Pushing is how you transfer commits from your local repository to a remote repo. It's the counterpart to git fetch , but whereas fetching imports commits to local branches, pushing exports commits to remote branches.


`git push -u origin master //then login w/ your creds`

**README.md** - [click here](./README.md)
