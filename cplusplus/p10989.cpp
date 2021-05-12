#include <iostream>
using namespace std;

int main(void)
{
	cin.tie(NULL);
	ios::sync_with_stdio(false);

	const int nMaxNum = 10001;
	int nArr[nMaxNum] = { 0, };
	int nNum = 0;
	int nValue = 0;
	cin >> nNum;

	for (int i = 0; i < nNum; i++)
	{
		cin >> nValue;
		nArr[nValue]++;
	}

	for (int i = 1; i < nMaxNum; i++)
	{
		for (int j = 0; j < nArr[i]; j++)
			cout << i << '\n';
	}

	return 0;
}