#include <iostream>
#include <vector>
using namespace std;
#define MAX_BUFFER 1000001
int arr[MAX_BUFFER]{ 0, };

int Compare(int a, int b)
{
	return a >= b ? b : a;
}

int FindMin(int n)
{
	if (n == 1)
		return 0;
	if (arr[n] != 0)
		return arr[n];
	int min = FindMin(n - 1) + 1;
	if (n % 3 == 0)
		min = Compare(min, FindMin(n / 3) + 1);
	if (n % 2 == 0)
		min = Compare(min, FindMin(n / 2) + 1);
	
	arr[n] = min;

	return arr[n];
}
int main(void)
{
	int N = 0;
	cin >> N;
	

	cout << FindMin(N) << endl;
	return 0;
}