function solution(n)
{
    console.log(n.toString().split('').reduce((acc, cur) => acc + Number(cur), 0));
    return n.toString().split('').reduce((acc, cur) => acc + Number(cur), 0);
}

solution(987);