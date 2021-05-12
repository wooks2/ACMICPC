#include <iostream>
using namespace std;

int main(void)
{
	int nTC = 0;
	int N = 0;
	cin >> nTC;

	long long arr[101]{ 0, };
	arr[0] = 1;
	arr[1] = 1;
	arr[2] = 1;
	arr[3] = 2;
	arr[4] = 2;

	for (int j = 5; j < 101; j++)
	{
		arr[j] = arr[j - 1] + arr[j - 5];
	}

	for (int i = 0; i < nTC; i++)
	{
		cin >> N;
		cout << arr[N - 1] << endl;
	}
	return 0;
}

