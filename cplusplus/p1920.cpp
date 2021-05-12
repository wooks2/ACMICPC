#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

bool BinarySearch(int* arr, int left, int right, int num)
{
	if (left > right)
		return false;

	int middle = (left + right) / 2;
	if (arr[middle] == num)
		return true;
	else if(arr[middle] > num)
		return BinarySearch(arr, left, middle - 1, num);
	else
		return BinarySearch(arr, middle + 1, right, num);
		
}
int main(void)
{
	cin.tie(NULL);
	ios::sync_with_stdio(false);

	int nArrNum = 0;
	int tc = 0;
	int num = 0;
	int nResult = 0;
	vector<int> nArr;
	
	cin >> nArrNum;
	nArr.resize(nArrNum, 0);

	for (int i = 0; i < nArrNum; i++)
		cin >> nArr[i];
	
	sort(nArr.begin(), nArr.end(), less<>());
	cin >> tc;
	
	for (int i = 0; i < tc; i++)
	{
		cin >> num;
		if (BinarySearch(nArr.data(), 0, nArrNum - 1, num))
			cout << 1 << '\n';
		else
			cout << 0 << '\n';
				
		
	}
	return 0;
}