#include <iostream>

using namespace std;


void Hanoi(int n, int from, int via, int to)
{
	if (n == 1)
	{
		cout << from << " " << to << '\n';
		return;
	}
	Hanoi(n - 1, from, to, via);
	cout << from << " " << to << '\n';	
	Hanoi(n - 1, via, from, to);


}

int main(void)
{
	ios::sync_with_stdio(false);
	int nNum = 0;
	int nResult = 1;
	cin >> nNum;

	for (int i = 0; i < nNum; i++)
		nResult *= 2;
	
	nResult -= 1;
	cout << nResult << '\n';
	Hanoi(nNum, 1, 2, 3);
	return 0;
}
