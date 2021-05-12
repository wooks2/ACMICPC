#include <iostream>
using namespace std;

int main(void)
{
	int A, B, C;
	int nResult = 0;
	A = B = C = 0;
	cin >> A >> B >> C;

	nResult = A / (C - B) + 1;

	if (C - B <= 0)
		nResult = -1;
	cout << nResult;
	return 0;
}