public class JewelleryStore {
    public List<DisplayCase> cases;

    public JewelleryStore() {
        this.cases = new List<DisplayCase>();
    }

    public void addDisplayCase() {
        DisplayCase Case = new DisplayCase();
        cases.addLast(Case);
    }

    public void addDisplayCaseWithInformation(String identifier,String type,Boolean isLighted) {
        DisplayCase Case = new DisplayCase(identifier,type,isLighted);
        cases.addLast(Case);
    }

    public void addDisplayTrayToCase(DisplayTray displayTray, DisplayCase displayCase) {
        displayCase.addTray(displayTray);
    }

    public void addItemToTray(JewelleryItem jewelleryItem, DisplayTray displayTray) {
        displayTray.addItem(jewelleryItem);
    }

    public void addMaterialToItem(MaterialComponent materialComponent, JewelleryItem jewelleryItem) {
        jewelleryItem.addComponent(materialComponent);
    }

    public double getStorePrice() {
        double temp = 0;
        for (int i = 0; i < cases.size(); i++) {
            temp = cases.getDataByIndex(i).getCasePrice() + temp;
        }
        return temp;
    }

    public DisplayCase getCaseTrayIn(DisplayTray tray) {
        for (int i = 0; i < cases.size(); i++) {
            if (cases.getDataByIndex(i).getTrays().size() == 0) {
                break;
            } else for (int j = 0; j < cases.getDataByIndex(i).getTrays().size(); j++) {
                if (cases.getDataByIndex(i).getTrays().getDataByIndex(j) == tray) {
                    return cases.getDataByIndex(i);
                }
            }
        }
        return null;
    }

    public DisplayTray getTrayItemIn(JewelleryItem item) {
        for (int i = 0; i < cases.size(); i++) {
            if (cases.getDataByIndex(i).getTrays().size() == 0) {
                break;
            } else for (int j = 0; j < cases.getDataByIndex(i).getTrays().size(); j++) {
                if (cases.getDataByIndex(i).getTrays().getDataByIndex(j).getItems().size() == 0) {
                    break;
                } else
                    for (int k = 0; k < cases.getDataByIndex(i).getTrays().getDataByIndex(j).getItems().size(); k++) {
                        if (cases.getDataByIndex(i).getTrays().getDataByIndex(j).getItems().getDataByIndex(k) == item) {
                            return cases.getDataByIndex(i).getTrays().getDataByIndex(j);
                        }
                    }
            }
        }
        return null;
    }

    public DisplayCase getCaseItemIn(JewelleryItem item) {
        for (int i = 0; i < cases.size(); i++) {
            if (cases.getDataByIndex(i).getTrays().size() == 0) {
                break;
            } else for (int j = 0; j < cases.getDataByIndex(i).getTrays().size(); j++) {
                if (cases.getDataByIndex(i).getTrays().getDataByIndex(j).getItems().size() == 0) {
                    break;
                } else
                    for (int k = 0; k < cases.getDataByIndex(i).getTrays().getDataByIndex(j).getItems().size(); k++) {
                        if (cases.getDataByIndex(i).getTrays().getDataByIndex(j).getItems().getDataByIndex(k) == item) {
                            return cases.getDataByIndex(i);
                        }
                    }
            }
        }
        return null;
    }


    public void viewAllStock() {
        // Implementation
    }

    public void drillDown() {
        // Implementation
    }

    public void searchItems(String searchTerm) {
        // Implementation
    }

    //寻找拥有最少tray的case，若店里没有任何case则返回null，注意返回的case中可能没有任何tray
    public DisplayCase leastTrayCase() {

        if (cases.size() == 0) {
            return null;
        }

        int temp = cases.getDataByIndex(0).getTrays().size();
        DisplayCase tempCase = cases.getDataByIndex(0);

        for (int i = 1; i < cases.size(); i++) {
            int Size = cases.getDataByIndex(i).getTrays().size();
            if (Size < temp) {
                temp = Size;
                tempCase = cases.getDataByIndex(i);
            }
        }
        return tempCase;
    }

    //智能分配
    public void smartAdd(JewelleryItem jewelleryItem) {
        //boolean sameTypeAndGender;
        List<JewelleryItem> temp = new List<>();
        List<DisplayTray> tempTray = new List<>();
        List<JewelleryItem> temp2 = new List<>();
        List<DisplayTray> tempTray2 = new List<>();


        for (int i = 0; i < cases.size(); i++) {
            if (cases.getDataByIndex(i).getTrays().size() == 0) {
                break;
            } else for (int j = 0; j < cases.getDataByIndex(i).getTrays().size(); j++) {
                if (cases.getDataByIndex(i).getTrays().getDataByIndex(j).getItems().size() == 0) {
                    break;
                } else
                    for (int k = 0; k < cases.getDataByIndex(i).getTrays().getDataByIndex(j).getItems().size(); k++) {
                        if (cases.getDataByIndex(i).getTrays().getDataByIndex(j).getItems().getDataByIndex(k).getType().equals(jewelleryItem.getType())) {
                            temp.addLast(cases.getDataByIndex(i).getTrays().getDataByIndex(j).getItems().getDataByIndex(k));
                            tempTray.addLast(cases.getDataByIndex(i).getTrays().getDataByIndex(j));
                        }
                    }
            }
        }


        if (temp.size() == 0) {
            if (cases.size() == 0) {
                addDisplayCase();
                cases.getDataByIndex(0).addNewTray();
                addItemToTray(jewelleryItem, cases.last().getTrays().last());
            } else {
                leastTrayCase().addNewTray();
                addItemToTray(jewelleryItem, leastTrayCase().getTrays().last());
            }
        }

        if (temp.size() > 0) {
            for (int i = 0; i < tempTray.size(); i++) {
                for (int j = 0; j < tempTray.getDataByIndex(i).getItems().size(); j++) {
                    if (tempTray.getDataByIndex(i).getItems().getDataByIndex(j).getGender().equals(jewelleryItem.getGender())) {
                        temp2.addLast(tempTray.getDataByIndex(i).getItems().getDataByIndex(j));
                        tempTray2.addLast(tempTray.getDataByIndex(i));
                    }
                }

            }
        }

        if (temp2.size() == 0) {
            if (cases.size() == 0) {
                addDisplayCase();
                cases.getDataByIndex(0).addNewTray();
                addItemToTray(jewelleryItem, cases.last().getTrays().last());
            } else {
                leastTrayCase().addNewTray();
                addItemToTray(jewelleryItem, leastTrayCase().getTrays().last());
            }
        }

        double tempObject = 0;
        DisplayTray tempTray3 = null;
        if (temp2.size() > 0) {
            for (int i = 0; i < tempTray2.size(); i++) {
                if (tempTray2.getDataByIndex(i).sumObject(jewelleryItem) > tempObject) {
                    tempObject = tempTray2.getDataByIndex(i).sumObject(jewelleryItem);
                    tempTray3 = tempTray2.getDataByIndex(i);
                }
            }
            addItemToTray(jewelleryItem, tempTray3);
        }
    }

    public boolean isCaseIdentifierRepeated(String newIdentifier) {
        if (cases.size() == 0) {
            return false;
        } else for (int i = 0; i < cases.size(); i++) {
            if (cases.getDataByIndex(i).getIdentifier().equals(newIdentifier)) {
                return true;
            }
        }
        return false;
    }


    public void removeItem(JewelleryItem jewelleryItem) {
        // Implementation
    }

    public void valueStock() {

        // Implementation
    }

    public void reset() {
        cases.clear();
        // Implementation
    }

    public void save() {
        // Implementation
    }

    public void load() {
        // Implementation
    }

    public List<DisplayCase> getCases() {
        return cases;
    }

    public void setCases(List<DisplayCase> cases) {
        this.cases = cases;
    }
}
