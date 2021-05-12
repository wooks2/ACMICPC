#include <iostream>
using namespace std;

int main(void)
{
	int arr[3] = { 0, };
	int nMax = -1;
	int nResult = 0;
	while (true)
	{
		cin >> arr[0] >> arr[1] >> arr[2];
		
		if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
			break;

		int nMaxIndex = -1;
		for (int i = 0; i < 3; i++)
		{
			if (arr[i] >= nMax)
			{
				nMax = arr[i];
				nMaxIndex = i;
			}
		}

		switch (nMaxIndex)
		{
		case 0:
			nResult = arr[0] * arr[0] - arr[1] * arr[1] - arr[2] * arr[2];
			break;
		case 1:
			nResult = arr[1] * arr[1] - arr[0] * arr[0] - arr[2] * arr[2];
			break;
		case 2:
			nResult = arr[2] * arr[2] - arr[1] * arr[1] - arr[0] * arr[0];
			break;
		default:
			break;
		}

		if (nResult == 0)
			cout << "right" << endl;
		else
			cout << "wrong" << endl;

		nMax = -1;

	}

	
	
	return 0;
}