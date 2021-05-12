#include <iostream>
#include <vector>
#include <unordered_map>
#include <algorithm>
using namespace std;

int BinarySearch(int* arr, int left, int right, int target)
{
	if (left > right)
		return -1;
	
	int mid = (left + right) / 2;

	if (arr[mid] == target)
		return mid;
	else if (arr[mid] > target)
		return BinarySearch(arr, left, mid - 1, target);
	else
		return BinarySearch(arr, mid + 1, right, target);
}

int main(void)
{
	cin.tie(NULL);
	ios::sync_with_stdio(false);

	int N, M;
	int num = 0;
	int nResult = 0;
	vector<int> NArr;
	unordered_map<int, int> NHash;
	N = M = 0;
	cin >> N;

	NArr.resize(N, 0);
	NHash.clear();
	for (int i = 0; i < N; i++)
	{
		cin >> NArr[i];
		if (NHash.find(NArr[i]) == NHash.end())
			NHash.insert(std::make_pair(NArr[i], 1));
		else
			NHash[NArr[i]]++;
	}
		
	sort(NArr.begin(), NArr.end(), less<>());

	cin >> M;
	
	for (int i = 0; i < M; i++)
	{
		int nResIndex = 0;
		//int nTempIndex = 0;
		nResult = 0;
		cin >> num;

		nResIndex = BinarySearch(NArr.data(), 0, N - 1, num);
		if (nResIndex != -1)
		{
			nResult = NHash[NArr[nResIndex]];
			/*nTempIndex = nResIndex;
			while (--nTempIndex >= 0)
			{
				if (NArr[nTempIndex] == num)
					nResult++;
				else
					break;
			}
			nTempIndex = nResIndex;
			while (++nTempIndex < N)
			{
				if (NArr[nTempIndex] == num)
					nResult++;
				else
					break;
			}*/
		}
		else
			nResult = 0;

		cout << nResult << " ";
	}

	return 0;
}