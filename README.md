# PageRank File Creator 

create external_pageRankFile.txt

### Prerequisites

You need to install [Jave 8 or later](https://java.com/zh_TW/download/) [Python](https://www.python.org/downloads/) and [networks](https://networkx.github.io/documentation/stable/install.html)

## Running the tests

1. Use the jar file in target. the first parameter will be the path to csv file. The second parameter will be folder which contain HTML files. The output is Edge.txt 

```
Page-Rank-Analysis-0.0.1-SNAPSHOT.jar /your/path/to/csv/file /your/path/to/html/folder
```

2. Use pagerank.py in folder to create external_pageRankFile.txt. The first parameter is path to Edge.txt, the second is path to html files
## Deployment

```
pagerank.py /your/path/to/csv/file /your/path/to/html/folder
```

## Built With

* [Eclpise](https://www.eclipse.org/) - IDE
* [Maven](https://maven.apache.org/) - Dependency Management
* [jsoup](https://jsoup.org/) - HTML Parser
* [networks](https://networkx.github.io/documentation/stable/install.html)

## Authors

* **Mark Chao** - *Initial work* 