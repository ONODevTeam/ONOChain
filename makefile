DEP := $(shell command -v dep 2> /dev/null)
TENDERMINT := $(shell command -v tendermint 2> /dev/null)

get_tools:
ifndef DEP
	@echo "Installing dep"
	go get -u -v github.com/golang/dep/cmd/dep
else
	@echo "Dep is already installed..."
endif

get_tendermint:
ifndef TENDERMINT
	@echo "Installing tendermint"
	go get -u github.com/tendermint/tendermint/cmd/tendermint
    go get -u github.com/tendermint/abci
    @cd $GOPATH/src/github.com/tendermint/abci
    make install
else
	@echo "Tendermint is already installed..."
endif