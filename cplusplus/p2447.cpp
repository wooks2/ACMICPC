#include <iostream>
using namespace std;

void PrintStars(int nNum, int i)
{
	if (nNum == 1)
	{
		cout << ("*");
		return;
	}
	
	int nEmptyStart = nNum / 3;
	int nEmptyEnd = nNum * 2 / 3;
	for (int j = 1; j <= nNum; )
	{
		if ((i > nEmptyStart && i <= nEmptyEnd) && (j > nEmptyStart && j <= nEmptyEnd))
		{
			cout << " ";
			j += 1;
		}
		else
		{
			PrintStars(nNum / 3, i % (nNum / 3));
			j += nNum / 3;
		}
				
	}
}

int main(void)
{
	int nNum = 0;
	cin >> nNum;

	for (int i = 1; i <= nNum; i++)
	{
		PrintStars(nNum, i);
		cout << endl;
	}
	return 0;
}