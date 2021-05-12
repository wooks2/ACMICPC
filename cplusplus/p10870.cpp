#include <iostream>
using namespace std;


int Fibonacci(int num)
{
	if (num == 0)
		return 0;
	if (num == 1)
		return 1;

	return Fibonacci(num - 2) + Fibonacci(num - 1);
}

int main(void)
{
	int nNum = 0;
	int nResult = 0;
	cin >> nNum;

	nResult = Fibonacci(nNum);
	cout << nResult;
	return 0;
}