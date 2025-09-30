#!/bin/bash
mkdir proyecto/backup_docs ; cp proyecto/docs/{manual.txt,guia.txt} proyecto/backup_docs ; mkdir proyecto/config_backup ; mv proyecto/config proyecto/config_backup ; tree