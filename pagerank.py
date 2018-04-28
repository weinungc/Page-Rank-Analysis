import networkx as nx
import sys

# argv[0] is path to Edge.txt, argv[1] is path to html files
G = nx.read_edgelist(sys.argv[0], create_using=nx.DiGraph())

print G.nodes()

page_rank = nx.pagerank(G, alpha=0.85, personalization=None, max_iter=30, tol=1e-06, nstart=None, weight='weight', dangling=None)

outputFile = open("external_pageRankFile.txt","w")

for key in page_rank:
	outputFile.write(sys.argv[1] + key + "=" + str( page_rank[key])+ "\n")
outputFile.close()