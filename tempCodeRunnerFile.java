 for (Member member : members) {
            if (member.getJoinDate().toString().compareTo(targetDate.toString()) < 0) {
                member.display();
            }
        }
        System.out.println();