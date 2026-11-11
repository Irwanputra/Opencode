.class public Lteam/dev/epro/apkcustom/widgets/logger/LogView$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/widgets/logger/LogView;->げつ〴ぬぐ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Ljava/lang/StringBuilder;

.field public final synthetic くし〴〺ぅ:Lteam/dev/epro/apkcustom/widgets/logger/LogView;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/widgets/logger/LogView;Ljava/lang/StringBuilder;)V
    .registers 3

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/logger/LogView$げつ〴ぬぐ;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/widgets/logger/LogView;

    iput-object p2, p0, Lteam/dev/epro/apkcustom/widgets/logger/LogView$げつ〴ぬぐ;->〺つふすそ:Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 5

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/logger/LogView$げつ〴ぬぐ;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/widgets/logger/LogView;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/logger/LogView$げつ〴ぬぐ;->〺つふすそ:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1
    iget-object v2, v0, Lteam/dev/epro/apkcustom/widgets/logger/LogView;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v3, 0x1f4

    if-le v2, v3, :cond_15

    invoke-virtual {v0}, Lteam/dev/epro/apkcustom/widgets/logger/LogView;->くし〴〺ぅ()V

    :cond_15
    iget-object v2, v0, Lteam/dev/epro/apkcustom/widgets/logger/LogView;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, Lteam/dev/epro/apkcustom/widgets/logger/LogView;->くし〴〺ぅ:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    return-void
.end method
