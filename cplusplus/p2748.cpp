//fibonacci 2

#include <iostream>
using namespace std;

#define MAX_BUFFER 91
long long dp[MAX_BUFFER]{ 0, };
long long Fibonacci(int n)
{
	if (n == 1)
		return 1;
	if (n == 0)
		return 0;
	if (dp[n] != 0)
		return dp[n];
	
	dp[n] = Fibonacci(n -1) + Fibonacci(n - 2);

	return Fibonacci(n - 1) + Fibonacci(n - 2);
}

int main(void)
{
	int n = 0;
	cin >> n;
	
	cout << Fibonacci(n);
	return 0;
}