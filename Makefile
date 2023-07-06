# Nome do arquivo principal (classe contendo o método 'main')
MAIN = Main

# Comando para compilar o programa Java
JAVAC = javac

# Opções de compilação
JFLAGS = -d bin -sourcepath src

# Caminho para os arquivos-fonte
SRCDIR = src

# Caminho para os arquivos compilados (.class)
BINDIR = bin

# Lista de todos os arquivos-fonte
SOURCES := $(wildcard $(SRCDIR)/*.java)

# Obter o nome dos arquivos .class gerados a partir dos arquivos-fonte
CLASSES := $(SOURCES:$(SRCDIR)/%.java=$(BINDIR)/%.class)

# Comando padrão do Makefile (compilar todos os arquivos .class)
all: $(CLASSES)

# Regra para compilar cada arquivo .class
$(BINDIR)/%.class: $(SRCDIR)/%.java
	$(JAVAC) $(JFLAGS) $<

# Limpar arquivos compilados
clean:
	rm -f $(BINDIR)/*.class

# Limpar arquivos compilados no windows
cleanwin:
	del bin\*.class


