#include <iostream>
using namespace std;

int Factorial(int nNum)
{
	if (nNum == 1)
		return 1;
	return nNum * Factorial(nNum - 1);
}
int main(void)
{
	ios::sync_with_stdio(false);
	int nNum = 0;
	int nResult = 0;
	cin >> nNum;

	if (nNum == 0)
	{
		cout << 1;
		return 0;
	}
		
	nResult = Factorial(nNum);
	cout << nResult;
	return 0;
}