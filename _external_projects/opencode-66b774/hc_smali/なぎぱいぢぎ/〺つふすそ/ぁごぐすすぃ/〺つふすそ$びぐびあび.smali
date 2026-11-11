.class public Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3073\u3050\u3073\u3042\u3073"
.end annotation


# instance fields
.field public final 〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$づざかべべ;

.field public final くし〴〺ぅ:Ljava/lang/String;

.field public げつ〴ぬぐ:Landroid/graphics/Bitmap;

.field public final synthetic づざかべべ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;

.field public final びぐびあび:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$づざかべべ;)V
    .registers 6

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;->づざかべべ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;->びぐびあび:Ljava/lang/String;

    iput-object p4, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;->くし〴〺ぅ:Ljava/lang/String;

    iput-object p5, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$づざかべべ;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ()V
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$づざかべべ;

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;->づざかべべ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->〺つふすそ:Ljava/util/HashMap;

    .line 2
    iget-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;->くし〴〺ぅ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;

    if-eqz v0, :cond_1e

    invoke-virtual {v0, p0}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;->げつ〴ぬぐ(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;)Z

    move-result v0

    if-eqz v0, :cond_40

    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;->づざかべべ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;

    .line 3
    iget-object v0, v0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->〺つふすそ:Ljava/util/HashMap;

    goto :goto_3b

    .line 4
    :cond_1e
    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;->づざかべべ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;

    .line 5
    iget-object v0, v0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->くし〴〺ぅ:Ljava/util/HashMap;

    .line 6
    iget-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;->くし〴〺ぅ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;

    if-eqz v0, :cond_40

    invoke-virtual {v0, p0}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;->げつ〴ぬぐ(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;)Z

    .line 7
    iget-object v0, v0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;->びぐびあび:Ljava/util/LinkedList;

    .line 8
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-nez v0, :cond_40

    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;->づざかべべ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;

    .line 9
    iget-object v0, v0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->くし〴〺ぅ:Ljava/util/HashMap;

    .line 10
    :goto_3b
    iget-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;->くし〴〺ぅ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_40
    return-void
.end method
