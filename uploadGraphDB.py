from graphdb.rdf4j.api.repositories_api import RepositoriesApi
from graphdb.rdf4j.configuration import Configuration
from graphdb.rdf4j.api_client import ApiClient
from graphdb.mime_types import RDFTypes
import requests


conf = Configuration()
conf.host = "http://localhost:7200/"
api_client = ApiClient(configuration=conf)
api_client.set_default_header("Content-Type", RDFTypes.TURTLE)
repository = "Final3"
api = RepositoriesApi(api_client)
f1 = open('C:/M.kharma_data/PhD/03-Semester-2022/Threat-modeling/OdTM-mkharma/TURTLELogging.owl', 'r')
f2 = open('C:/M.kharma_data/PhD/03-Semester-2022/Threat-modeling/OdTM-mkharma/TURTLECVE.owl', 'r')
api.put_statements(repository, rdf_data=(f1.read()+f2.read()))
# api.put_statements(repository, rdf_data=(f2.read()))
    # requests.post('http://localhost:7200/repositories/test/statements', data=f, headers=headers)
