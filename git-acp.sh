git_push(){
    echo -e "\033[31m `pwd` push $1 times  \033[0m"
    git push
    if [ $? -eq 0 ]; then
        echo -e "succeed\n"
        return
    else
        if [ $1 -lt 15 ]; then
            git_push $[$1+1]
            return
        else
            echo "fail"
            return 100;
        fi
    fi  
}

 git add .
 git commit -m auto
 git_push 1