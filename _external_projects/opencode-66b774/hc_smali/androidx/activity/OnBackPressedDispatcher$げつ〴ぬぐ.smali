.class public Landroidx/activity/OnBackPressedDispatcher$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/OnBackPressedDispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/activity/OnBackPressedDispatcher;

.field public final げつ〴ぬぐ:Lづざかべべ/げつ〴ぬぐ/〺つふすそ;


# direct methods
.method public constructor <init>(Landroidx/activity/OnBackPressedDispatcher;Lづざかべべ/げつ〴ぬぐ/〺つふすそ;)V
    .registers 3

    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$げつ〴ぬぐ;->〺つふすそ:Landroidx/activity/OnBackPressedDispatcher;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/activity/OnBackPressedDispatcher$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/げつ〴ぬぐ/〺つふすそ;

    return-void
.end method


# virtual methods
.method public cancel()V
    .registers 3

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$げつ〴ぬぐ;->〺つふすそ:Landroidx/activity/OnBackPressedDispatcher;

    iget-object v0, v0, Landroidx/activity/OnBackPressedDispatcher;->〺つふすそ:Ljava/util/ArrayDeque;

    iget-object v1, p0, Landroidx/activity/OnBackPressedDispatcher$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/げつ〴ぬぐ/〺つふすそ;

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/げつ〴ぬぐ/〺つふすそ;

    .line 1
    iget-object v0, v0, Lづざかべべ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
