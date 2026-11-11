.class public Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public げつ〴ぬぐ:Ljava/util/TreeSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeSet<",
            "L\u3041\u3054\u3050\u3059\u3059\u3043/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3041\u3054\u3050\u3059\u3059\u3043/\u307a\u3041\u3042\u306d\u3058$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    iput-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Z)Ljava/util/Collection;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/Collection<",
            "L\u3041\u3054\u3050\u3059\u3059\u3043/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3041\u3054\u3050\u3059\u3059\u3043/\u307a\u3041\u3042\u306d\u3058$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iget-object v1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    invoke-virtual {v1}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_b
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    .line 1
    iget-boolean v3, v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->びぐびあび:Z

    if-ne v3, p1, :cond_b

    .line 2
    invoke-virtual {v0, v2}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_1f
    return-object v0
.end method

.method public くし〴〺ぅ()Ljava/util/Collection;
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "L\u3041\u3054\u3050\u3059\u3059\u3043/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3041\u3054\u3050\u3059\u3059\u3043/\u307a\u3041\u3042\u306d\u3058$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/PriorityQueue;

    iget-object v1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    invoke-direct {v0, v1}, Ljava/util/PriorityQueue;-><init>(Ljava/util/SortedSet;)V

    new-instance v1, Ljava/util/TreeSet;

    invoke-direct {v1}, Ljava/util/TreeSet;-><init>()V

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_18

    goto/16 :goto_a4

    :cond_18
    :goto_18
    if-eqz v2, :cond_a4

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    if-eqz v5, :cond_9e

    invoke-virtual {v2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->づざかべべ()Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {v5}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->〺つふすそ()Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v6

    const/4 v7, -0x1

    if-ne v6, v7, :cond_33

    goto/16 :goto_9e

    :cond_33
    invoke-virtual {v2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->〺つふすそ()Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {v5}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->〺つふすそ()Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7e

    iget v6, v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->くし〴〺ぅ:I

    iget v7, v5, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->くし〴〺ぅ:I

    if-lt v6, v7, :cond_7e

    .line 2
    iget-boolean v6, v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->びぐびあび:Z

    iget-boolean v7, v5, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->びぐびあび:Z

    if-ne v6, v7, :cond_4e

    goto :goto_a1

    .line 3
    :cond_4e
    invoke-virtual {v5}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->ぁごぐすすぃ()[Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    move-result-object v5

    aget-object v6, v5, v3

    invoke-virtual {v0, v6}, Ljava/util/PriorityQueue;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5f

    aget-object v6, v5, v3

    invoke-virtual {v0, v6}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    :cond_5f
    aget-object v6, v5, v4

    invoke-virtual {v6}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->づざかべべ()Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {v2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->づざかべべ()Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_70

    goto :goto_18

    :cond_70
    aget-object v6, v5, v4

    invoke-virtual {v0, v6}, Ljava/util/PriorityQueue;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_18

    aget-object v5, v5, v4

    invoke-virtual {v0, v5}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    goto :goto_18

    .line 4
    :cond_7e
    iget-boolean v6, v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->びぐびあび:Z

    iget-boolean v7, v5, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->びぐびあび:Z

    if-ne v6, v7, :cond_85

    goto :goto_18

    .line 5
    :cond_85
    invoke-virtual {v2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->ぁごぐすすぃ()[Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    move-result-object v2

    aget-object v6, v2, v3

    iget v6, v6, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->くし〴〺ぅ:I

    iget v7, v5, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->くし〴〺ぅ:I

    if-ne v6, v7, :cond_92

    goto :goto_97

    :cond_92
    aget-object v6, v2, v3

    invoke-virtual {v0, v6}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    :goto_97
    invoke-virtual {v0, v5}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    aget-object v2, v2, v4

    goto/16 :goto_18

    :cond_9e
    :goto_9e
    invoke-virtual {v1, v2}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    :goto_a1
    move-object v2, v5

    goto/16 :goto_18

    .line 6
    :cond_a4
    :goto_a4
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    invoke-virtual {v1}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_ad
    :goto_ad
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    .line 7
    iget-boolean v6, v5, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->びぐびあび:Z

    if-eqz v6, :cond_ad

    .line 8
    invoke-virtual {v0, v5}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    goto :goto_ad

    :cond_c1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x13

    if-ge v2, v5, :cond_109

    iget-object v2, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    invoke-virtual {v2}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_cd
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_109

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    .line 9
    iget-boolean v6, v5, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->びぐびあび:Z

    if-nez v6, :cond_de

    goto :goto_cd

    .line 10
    :cond_de
    invoke-virtual {v1, v5}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e5

    goto :goto_cd

    :cond_e5
    invoke-virtual {v1}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_e9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_101

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    .line 11
    iget-boolean v8, v7, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->びぐびあび:Z

    if-nez v8, :cond_e9

    .line 12
    invoke-virtual {v5, v7}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->げつ〴ぬぐ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;)Z

    move-result v7

    if-eqz v7, :cond_e9

    const/4 v6, 0x1

    goto :goto_102

    :cond_101
    const/4 v6, 0x0

    :goto_102
    if-eqz v6, :cond_105

    goto :goto_cd

    :cond_105
    invoke-virtual {v0, v5}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    goto :goto_cd

    :cond_109
    return-object v0
.end method

.method public げつ〴ぬぐ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;Z)V
    .registers 4

    iget-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    invoke-static {p1, p2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇ〳〲〺すっ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;ZLjava/util/TreeSet;)V

    return-void
.end method
